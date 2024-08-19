package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Wine-bold`: ImageVector
    get() {
        if (`_wine-bold` != null) {
            return `_wine-bold`!!
        }
        `_wine-bold` = Builder(name = "Wine-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.17f, 102.54f)
                lineTo(187.39f, 28.61f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 175.89f, 20.0f)
                horizontalLineTo(80.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.5f, 8.61f)
                lineTo(46.83f, 102.54f)
                arcToRelative(67.45f, 67.45f, 0.0f, false, false, 18.53f, 68.72f)
                arcTo(91.32f, 91.32f, 0.0f, false, false, 116.0f, 195.2f)
                verticalLineTo(228.0f)
                horizontalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(140.0f)
                verticalLineTo(195.2f)
                arcToRelative(91.32f, 91.32f, 0.0f, false, false, 50.65f, -23.94f)
                arcTo(67.45f, 67.45f, 0.0f, false, false, 209.17f, 102.54f)
                close()
                moveTo(89.08f, 44.0f)
                horizontalLineToRelative(77.84f)
                lineToRelative(18.38f, 62.41f)
                curveToRelative(-10.88f, 2.8f, -28.05f, 3.0f, -51.88f, -9.12f)
                curveTo(110.68f, 85.78f, 91.92f, 83.0f, 77.24f, 84.22f)
                close()
                moveTo(128.0f, 172.0f)
                arcToRelative(67.5f, 67.5f, 0.0f, false, true, -46.26f, -18.27f)
                arcToRelative(43.55f, 43.55f, 0.0f, false, true, -12.0f, -43.89f)
                curveToRelative(18.44f, -5.33f, 38.64f, 1.66f, 52.87f, 8.87f)
                curveToRelative(11.55f, 5.85f, 30.18f, 13.28f, 50.26f, 13.28f)
                arcToRelative(74.15f, 74.15f, 0.0f, false, false, 14.29f, -1.35f)
                arcToRelative(43.2f, 43.2f, 0.0f, false, true, -12.87f, 23.09f)
                arcTo(67.5f, 67.5f, 0.0f, false, true, 128.0f, 172.0f)
                close()
            }
        }
        .build()
        return `_wine-bold`!!
    }

private var `_wine-bold`: ImageVector? = null

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

public val BoldGroup.`Bicycle-bold`: ImageVector
    get() {
        if (`_bicycle-bold` != null) {
            return `_bicycle-bold`!!
        }
        `_bicycle-bold` = Builder(name = "Bicycle-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 108.0f)
                arcToRelative(51.82f, 51.82f, 0.0f, false, false, -15.13f, 2.25f)
                lineTo(168.89f, 76.0f)
                lineTo(192.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, -28.0f)
                lineTo(148.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.37f, 18.0f)
                lineToRelative(8.14f, 14.0f)
                lineTo(109.56f, 84.0f)
                lineTo(94.37f, 58.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 84.0f, 52.0f)
                lineTo(52.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(77.11f, 76.0f)
                lineTo(88.18f, 95.0f)
                lineTo(74.0f, 112.89f)
                arcToRelative(52.17f, 52.17f, 0.0f, true, false, 18.8f, 14.92f)
                lineToRelative(8.37f, -10.57f)
                lineTo(118.0f, 146.05f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 138.7f, 134.0f)
                lineTo(123.56f, 108.0f)
                horizontalLineToRelative(36.21f)
                lineToRelative(8.39f, 14.38f)
                arcTo(52.0f, 52.0f, 0.0f, true, false, 204.0f, 108.0f)
                close()
                moveTo(80.0f, 160.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -21.71f, -27.28f)
                lineToRelative(-15.7f, 19.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.82f, 14.9f)
                lineToRelative(15.7f, -19.83f)
                arcTo(27.84f, 27.84f, 0.0f, false, true, 80.0f, 160.0f)
                close()
                moveTo(204.0f, 188.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -23.11f, -43.79f)
                lineToRelative(12.74f, 21.84f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 214.37f, 154.0f)
                lineToRelative(-12.75f, -21.84f)
                curveToRelative(0.79f, -0.07f, 1.58f, -0.11f, 2.38f, -0.11f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f)
                close()
            }
        }
        .build()
        return `_bicycle-bold`!!
    }

private var `_bicycle-bold`: ImageVector? = null

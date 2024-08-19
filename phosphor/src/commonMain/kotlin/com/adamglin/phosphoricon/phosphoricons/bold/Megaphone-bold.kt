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

public val BoldGroup.`Megaphone-bold`: ImageVector
    get() {
        if (`_megaphone-bold` != null) {
            return `_megaphone-bold`!!
        }
        `_megaphone-bold` = Builder(name = "Megaphone-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 120.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, -52.0f, -52.0f)
                horizontalLineTo(160.32f)
                curveToRelative(-3.44f, -0.21f, -52.6f, -4.0f, -99.46f, -43.3f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 40.0f)
                verticalLineTo(200.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 11.54f, 18.12f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, false, 21.32f, -2.81f)
                arcTo(192.92f, 192.92f, 0.0f, false, true, 144.0f, 174.47f)
                verticalLineToRelative(26.2f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 8.9f, 16.64f)
                arcToRelative(11.35f, 11.35f, 0.0f, false, false, 1.39f, 0.8f)
                lineToRelative(14.44f, 7.06f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 198.37f, 213.0f)
                lineToRelative(11.09f, -41.82f)
                arcTo(52.07f, 52.07f, 0.0f, false, false, 252.0f, 120.0f)
                close()
                moveTo(52.0f, 191.63f)
                verticalLineTo(48.4f)
                curveToRelative(36.17f, 28.07f, 72.17f, 38.1f, 92.0f, 41.66f)
                verticalLineTo(150.0f)
                curveTo(124.17f, 153.52f, 88.17f, 163.55f, 52.0f, 191.63f)
                close()
                moveTo(176.39f, 202.2f)
                lineTo(168.0f, 198.1f)
                verticalLineTo(172.0f)
                horizontalLineToRelative(16.4f)
                close()
                moveTo(200.0f, 148.0f)
                horizontalLineTo(168.0f)
                verticalLineTo(92.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 0.0f, 56.0f)
                close()
            }
        }
        .build()
        return `_megaphone-bold`!!
    }

private var `_megaphone-bold`: ImageVector? = null

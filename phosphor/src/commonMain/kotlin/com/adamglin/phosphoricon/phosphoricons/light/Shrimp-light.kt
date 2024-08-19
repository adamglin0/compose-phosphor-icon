package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Shrimp-light`: ImageVector
    get() {
        if (`_shrimp-light` != null) {
            return `_shrimp-light`!!
        }
        `_shrimp-light` = Builder(name = "Shrimp-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(138.0f, 116.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 116.0f)
                close()
                moveTo(221.9f, 84.0f)
                arcTo(78.1f, 78.1f, 0.0f, false, true, 144.0f, 158.0f)
                lineTo(112.0f, 158.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 28.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(118.0f, 198.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(96.0f, 230.0f)
                arcTo(78.0f, 78.0f, 0.0f, false, true, 96.0f, 74.0f)
                lineTo(212.0f, 74.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -28.0f)
                lineTo(128.0f, 46.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -22.0f, -22.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, 10.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 9.9f, 50.0f)
                close()
                moveTo(50.65f, 199.88f)
                lineToRelative(35.48f, -25.34f)
                arcTo(23.74f, 23.74f, 0.0f, false, true, 86.0f, 172.0f)
                arcToRelative(25.92f, 25.92f, 0.0f, false, true, 1.46f, -8.57f)
                lineTo(31.51f, 138.0f)
                arcToRelative(65.8f, 65.8f, 0.0f, false, false, 19.14f, 61.88f)
                close()
                moveTo(90.3f, 186.3f)
                lineTo(60.49f, 207.59f)
                arcTo(65.56f, 65.56f, 0.0f, false, false, 96.0f, 218.0f)
                horizontalLineToRelative(10.0f)
                lineTo(106.0f, 197.29f)
                arcTo(26.05f, 26.05f, 0.0f, false, true, 90.3f, 186.3f)
                close()
                moveTo(106.0f, 146.71f)
                lineTo(106.0f, 86.0f)
                lineTo(96.0f, 86.0f)
                arcToRelative(66.1f, 66.1f, 0.0f, false, false, -60.86f, 40.47f)
                lineTo(94.0f, 153.24f)
                arcTo(25.86f, 25.86f, 0.0f, false, true, 106.0f, 146.71f)
                close()
                moveTo(209.73f, 86.0f)
                lineTo(118.0f, 86.0f)
                verticalLineToRelative(60.0f)
                horizontalLineToRelative(26.0f)
                arcTo(66.09f, 66.09f, 0.0f, false, false, 209.73f, 86.0f)
                close()
            }
        }
        .build()
        return `_shrimp-light`!!
    }

private var `_shrimp-light`: ImageVector? = null

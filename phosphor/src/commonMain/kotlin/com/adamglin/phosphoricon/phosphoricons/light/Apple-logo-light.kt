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

public val LightGroup.`Apple-logo-light`: ImageVector
    get() {
        if (`_apple-logo-light` != null) {
            return `_apple-logo-light`!!
        }
        `_apple-logo-light` = Builder(name = "Apple-logo-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.4f, 167.84f)
                curveTo(201.71f, 155.69f, 198.0f, 135.12f, 198.0f, 120.0f)
                curveToRelative(0.0f, -18.42f, 13.86f, -34.29f, 22.12f, -42.12f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.71f)
                curveTo(208.0f, 57.7f, 187.07f, 50.0f, 168.0f, 50.0f)
                arcToRelative(70.23f, 70.23f, 0.0f, false, false, -40.0f, 12.55f)
                arcToRelative(69.6f, 69.6f, 0.0f, false, false, -89.31f, 8.08f)
                arcTo(72.63f, 72.63f, 0.0f, false, false, 18.0f, 123.35f)
                arcToRelative(125.11f, 125.11f, 0.0f, false, false, 39.53f, 88.33f)
                arcTo(37.85f, 37.85f, 0.0f, false, false, 83.6f, 222.0f)
                horizontalLineToRelative(87.7f)
                arcTo(37.83f, 37.83f, 0.0f, false, false, 199.0f, 210.07f)
                arcToRelative(122.6f, 122.6f, 0.0f, false, false, 17.54f, -24.2f)
                curveToRelative(6.55f, -12.0f, 5.77f, -13.75f, 5.0f, -15.48f)
                arcTo(6.07f, 6.07f, 0.0f, false, false, 219.4f, 167.84f)
                close()
                moveTo(190.17f, 201.84f)
                arcTo(25.82f, 25.82f, 0.0f, false, true, 171.3f, 210.0f)
                lineTo(83.6f, 210.0f)
                arcTo(25.85f, 25.85f, 0.0f, false, true, 65.78f, 203.0f)
                arcTo(113.21f, 113.21f, 0.0f, false, true, 30.0f, 123.0f)
                arcToRelative(60.55f, 60.55f, 0.0f, false, true, 17.21f, -44.0f)
                arcTo(56.82f, 56.82f, 0.0f, false, true, 88.0f, 62.0f)
                horizontalLineToRelative(0.81f)
                arcToRelative(57.35f, 57.35f, 0.0f, false, true, 35.44f, 12.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.5f, 0.0f)
                arcTo(57.39f, 57.39f, 0.0f, false, true, 168.0f, 62.0f)
                curveToRelative(13.89f, 0.0f, 28.81f, 4.68f, 39.11f, 12.0f)
                curveToRelative(-9.44f, 10.14f, -21.1f, 26.59f, -21.1f, 46.0f)
                curveToRelative(0.0f, 23.78f, 7.81f, 42.6f, 22.66f, 54.77f)
                arcTo(107.33f, 107.33f, 0.0f, false, true, 190.17f, 201.89f)
                close()
                moveTo(130.17f, 30.45f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 167.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -25.18f, 19.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.62f, -3.0f)
                close()
            }
        }
        .build()
        return `_apple-logo-light`!!
    }

private var `_apple-logo-light`: ImageVector? = null

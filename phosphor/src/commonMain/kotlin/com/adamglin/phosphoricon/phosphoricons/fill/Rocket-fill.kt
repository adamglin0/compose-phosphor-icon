package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Rocket-fill`: ImageVector
    get() {
        if (`_rocket-fill` != null) {
            return `_rocket-fill`!!
        }
        `_rocket-fill` = Builder(name = "Rocket-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(112.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 224.0f)
                close()
                moveTo(223.62f, 155.83f)
                lineTo(211.26f, 211.46f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -25.51f, 9.11f)
                lineTo(158.51f, 200.0f)
                horizontalLineToRelative(-61.0f)
                lineTo(70.25f, 220.57f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -25.51f, -9.11f)
                lineTo(32.38f, 155.83f)
                arcToRelative(16.09f, 16.09f, 0.0f, false, true, 3.32f, -13.71f)
                lineToRelative(28.56f, -34.26f)
                arcToRelative(123.07f, 123.07f, 0.0f, false, true, 8.57f, -36.67f)
                curveToRelative(12.9f, -32.34f, 36.0f, -52.63f, 45.37f, -59.85f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 19.6f, 0.0f)
                curveToRelative(9.34f, 7.22f, 32.47f, 27.51f, 45.37f, 59.85f)
                arcToRelative(123.07f, 123.07f, 0.0f, false, true, 8.57f, 36.67f)
                lineToRelative(28.56f, 34.26f)
                arcTo(16.09f, 16.09f, 0.0f, false, true, 223.62f, 155.83f)
                close()
                moveTo(84.39f, 189.83f)
                quadTo(68.28f, 160.5f, 64.83f, 132.16f)
                lineTo(48.0f, 152.36f)
                lineTo(60.36f, 208.0f)
                lineToRelative(0.18f, -0.13f)
                close()
                moveTo(140.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 100.0f)
                close()
                moveTo(208.0f, 152.36f)
                lineTo(191.17f, 132.16f)
                quadToRelative(-3.42f, 28.28f, -19.56f, 57.69f)
                lineToRelative(23.85f, 18.0f)
                lineToRelative(0.18f, 0.13f)
                close()
            }
        }
        .build()
        return `_rocket-fill`!!
    }

private var `_rocket-fill`: ImageVector? = null

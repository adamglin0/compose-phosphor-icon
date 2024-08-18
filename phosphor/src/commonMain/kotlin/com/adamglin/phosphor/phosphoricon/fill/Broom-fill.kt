package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Broom-fill`: ImageVector
    get() {
        if (`_broom-fill` != null) {
            return `_broom-fill`!!
        }
        `_broom-fill` = Builder(name = "Broom-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.29f, 216.7f)
                curveTo(212.86f, 205.69f, 200.0f, 182.12f, 200.0f, 152.0f)
                verticalLineTo(134.69f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, -10.09f, -14.87f)
                lineToRelative(-28.65f, -11.46f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 156.79f, 98.0f)
                lineToRelative(22.32f, -56.67f)
                curveTo(184.0f, 28.79f, 178.0f, 14.21f, 165.34f, 9.51f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -30.7f, 13.71f)
                lineTo(112.25f, 80.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.41f, 4.5f)
                lineTo(73.11f, 73.08f)
                arcToRelative(15.91f, 15.91f, 0.0f, false, false, -17.38f, 3.66f)
                curveTo(34.68f, 98.4f, 24.0f, 123.71f, 24.0f, 152.0f)
                arcToRelative(111.53f, 111.53f, 0.0f, false, false, 31.15f, 77.53f)
                arcTo(8.06f, 8.06f, 0.0f, false, false, 61.0f, 232.0f)
                horizontalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -7.51f)
                arcTo(8.21f, 8.21f, 0.0f, false, false, 235.29f, 216.7f)
                close()
                moveTo(115.11f, 216.0f)
                arcToRelative(87.52f, 87.52f, 0.0f, false, true, -24.26f, -41.71f)
                arcToRelative(8.21f, 8.21f, 0.0f, false, false, -9.25f, -6.18f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 75.28f, 178.0f)
                arcToRelative(105.33f, 105.33f, 0.0f, false, false, 18.36f, 38.0f)
                horizontalLineTo(64.44f)
                arcTo(95.62f, 95.62f, 0.0f, false, true, 40.0f, 152.0f)
                arcToRelative(85.92f, 85.92f, 0.0f, false, true, 7.73f, -36.3f)
                lineToRelative(137.8f, 55.13f)
                curveToRelative(3.0f, 18.06f, 10.55f, 33.5f, 21.89f, 45.19f)
                close()
            }
        }
        .build()
        return `_broom-fill`!!
    }

private var `_broom-fill`: ImageVector? = null

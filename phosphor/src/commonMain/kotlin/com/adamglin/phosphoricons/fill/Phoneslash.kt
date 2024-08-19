package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Phoneslash: ImageVector
    get() {
        if (_phoneslash != null) {
            return _phoneslash!!
        }
        _phoneslash = Builder(name = "Phoneslash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.28f, 177.85f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -18.38f, 5.07f)
                lineToRelative(-24.76f, -19.0f)
                arcToRelative(3.43f, 3.43f, 0.0f, false, true, -0.53f, -0.48f)
                lineTo(109.18f, 71.62f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.55f, -6.68f)
                curveToRelative(43.0f, -4.62f, 87.74f, 9.12f, 119.86f, 41.24f)
                horizontalLineToRelative(0.0f)
                curveTo(251.58f, 126.17f, 253.51f, 155.64f, 236.28f, 177.85f)
                close()
                moveTo(53.93f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.09f, 45.38f)
                lineTo(69.71f, 75.77f)
                arcToRelative(142.0f, 142.0f, 0.0f, false, false, -45.3f, 30.41f)
                curveToRelative(-20.0f, 20.0f, -21.92f, 49.46f, -4.69f, 71.67f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 18.38f, 5.07f)
                lineToRelative(49.0f, -17.37f)
                lineToRelative(0.29f, -0.11f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.75f, -11.72f)
                lineToRelative(5.9f, -29.51f)
                arcToRelative(73.64f, 73.64f, 0.0f, false, true, 8.57f, -2.39f)
                lineToRelative(90.5f, 99.56f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
            }
        }
        .build()
        return _phoneslash!!
    }

private var _phoneslash: ImageVector? = null

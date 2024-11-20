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

public val FillGroup.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = Builder(name = "Flower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.35f, 129.36f)
                curveToRelative(-0.81f, -0.47f, -1.7f, -0.92f, -2.62f, -1.36f)
                curveToRelative(0.92f, -0.44f, 1.81f, -0.89f, 2.62f, -1.36f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, -69.28f)
                curveToRelative(-0.81f, 0.47f, -1.65f, 1.0f, -2.48f, 1.59f)
                curveToRelative(0.08f, -1.0f, 0.13f, -2.0f, 0.13f, -3.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -80.0f, 0.0f)
                curveToRelative(0.0f, 0.94f, 0.0f, 1.94f, 0.13f, 3.0f)
                curveToRelative(-0.83f, -0.57f, -1.67f, -1.12f, -2.48f, -1.59f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, 69.28f)
                curveToRelative(0.81f, 0.47f, 1.7f, 0.92f, 2.62f, 1.36f)
                curveToRelative(-0.92f, 0.44f, -1.81f, 0.89f, -2.62f, 1.36f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 69.28f)
                curveToRelative(0.81f, -0.47f, 1.65f, -1.0f, 2.48f, -1.59f)
                curveToRelative(-0.08f, 1.0f, -0.13f, 2.0f, -0.13f, 2.95f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 80.0f, 0.0f)
                curveToRelative(0.0f, -0.94f, -0.05f, -1.94f, -0.13f, -2.95f)
                curveToRelative(0.83f, 0.57f, 1.67f, 1.12f, 2.48f, 1.59f)
                arcTo(39.79f, 39.79f, 0.0f, false, false, 190.29f, 204.0f)
                arcToRelative(40.43f, 40.43f, 0.0f, false, false, 10.42f, -1.38f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 9.64f, -73.28f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 156.0f)
                close()
            }
        }
        .build()
        return _flower!!
    }

private var _flower: ImageVector? = null

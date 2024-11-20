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

public val FillGroup.SpinnerBall: ImageVector
    get() {
        if (_spinnerBall != null) {
            return _spinnerBall!!
        }
        _spinnerBall = Builder(name = "SpinnerBall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(167.11f, 49.19f)
                curveTo(170.24f, 83.71f, 155.0f, 99.44f, 135.0f, 113.61f)
                curveToRelative(-2.25f, -24.48f, -8.44f, -49.8f, -38.37f, -67.82f)
                arcToRelative(87.89f, 87.89f, 0.0f, false, true, 70.5f, 3.4f)
                close()
                moveTo(40.18f, 133.54f)
                curveToRelative(28.34f, -20.0f, 49.57f, -14.68f, 71.87f, -4.39f)
                curveTo(92.0f, 143.34f, 73.19f, 161.36f, 72.52f, 196.26f)
                arcTo(87.92f, 87.92f, 0.0f, false, true, 40.18f, 133.54f)
                close()
                moveTo(176.68f, 201.27f)
                curveToRelative(-31.45f, -14.55f, -37.47f, -35.58f, -39.71f, -60.0f)
                curveToRelative(12.72f, 5.86f, 26.31f, 10.75f, 41.3f, 10.75f)
                curveToRelative(11.33f, 0.0f, 23.46f, -2.8f, 36.63f, -10.08f)
                arcTo(88.2f, 88.2f, 0.0f, false, true, 176.68f, 201.27f)
                close()
            }
        }
        .build()
        return _spinnerBall!!
    }

private var _spinnerBall: ImageVector? = null

package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) {
            return _flowArrow!!
        }
        _flowArrow = Builder(name = "FlowArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.83f, 77.17f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineTo(230.34f, 76.0f)
                horizontalLineTo(208.0f)
                curveToRelative(-46.67f, 0.0f, -57.84f, 26.81f, -67.69f, 50.46f)
                curveToRelative(-9.46f, 22.69f, -18.4f, 44.16f, -56.55f, 45.48f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 0.0f, 8.0f)
                curveToRelative(43.49f, -1.42f, 54.33f, -27.39f, 63.91f, -50.39f)
                curveTo(157.45f, 106.12f, 166.67f, 84.0f, 208.0f, 84.0f)
                horizontalLineToRelative(22.34f)
                lineToRelative(-25.17f, 25.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineToRelative(32.0f, -32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 242.83f, 77.17f)
                close()
                moveTo(48.0f, 204.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 48.0f, 204.0f)
                close()
            }
        }
        .build()
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null

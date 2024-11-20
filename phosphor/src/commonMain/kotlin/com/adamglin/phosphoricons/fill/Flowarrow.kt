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

public val FillGroup.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) {
            return _flowArrow!!
        }
        _flowArrow = Builder(name = "FlowArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.66f, 85.66f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(220.69f, 88.0f)
                horizontalLineTo(208.0f)
                curveToRelative(-38.67f, 0.0f, -46.59f, 19.0f, -56.62f, 43.08f)
                curveTo(141.05f, 155.88f, 129.33f, 184.0f, 80.0f, 184.0f)
                horizontalLineTo(79.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -16.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(38.67f, 0.0f, 46.59f, -19.0f, 56.62f, -43.08f)
                curveTo(147.0f, 100.12f, 158.67f, 72.0f, 208.0f, 72.0f)
                horizontalLineToRelative(12.69f)
                lineTo(202.34f, 53.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineToRelative(32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 245.66f, 85.66f)
                close()
            }
        }
        .build()
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null

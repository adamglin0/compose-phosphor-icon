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

public val FillGroup.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) {
            return _thermometerSimple!!
        }
        _thermometerSimple = Builder(name = "ThermometerSimple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 146.08f)
                verticalLineTo(40.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                verticalLineTo(146.08f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(128.0f, 24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(112.0f)
                verticalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 24.0f)
                close()
            }
        }
        .build()
        return _thermometerSimple!!
    }

private var _thermometerSimple: ImageVector? = null

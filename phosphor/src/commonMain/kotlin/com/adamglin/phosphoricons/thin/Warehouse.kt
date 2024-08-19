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

public val ThinGroup.Warehouse: ImageVector
    get() {
        if (_warehouse != null) {
            return _warehouse!!
        }
        _warehouse = Builder(name = "Warehouse", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 188.0f)
                horizontalLineTo(228.0f)
                verticalLineTo(54.66f)
                lineToRelative(12.84f, -2.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -1.68f, -7.82f)
                lineToRelative(-224.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 100.0f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, false, 0.84f, -0.09f)
                lineTo(28.0f, 97.52f)
                verticalLineTo(188.0f)
                horizontalLineTo(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(36.0f, 95.81f)
                lineTo(220.0f, 56.38f)
                verticalLineTo(188.0f)
                horizontalLineTo(188.0f)
                verticalLineTo(128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(60.0f)
                horizontalLineTo(36.0f)
                close()
                moveTo(180.0f, 156.0f)
                horizontalLineTo(76.0f)
                verticalLineTo(132.0f)
                horizontalLineTo(180.0f)
                close()
                moveTo(76.0f, 164.0f)
                horizontalLineTo(180.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(76.0f)
                close()
            }
        }
        .build()
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null

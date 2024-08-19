package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Warehouse: ImageVector
    get() {
        if (_warehouse != null) {
            return _warehouse!!
        }
        _warehouse = Builder(name = "Warehouse", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 180.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(61.13f)
                lineToRelative(6.51f, -1.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -5.0f, -23.47f)
                lineToRelative(-224.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 16.0f, 108.0f)
                arcToRelative(12.21f, 12.21f, 0.0f, false, false, 2.53f, -0.26f)
                lineToRelative(1.48f, -0.32f)
                verticalLineTo(180.0f)
                horizontalLineTo(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(44.0f, 102.27f)
                lineToRelative(168.0f, -36.0f)
                verticalLineTo(180.0f)
                horizontalLineTo(192.0f)
                verticalLineTo(120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(60.0f)
                horizontalLineTo(44.0f)
                close()
                moveTo(168.0f, 144.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(132.0f)
                horizontalLineToRelative(80.0f)
                close()
                moveTo(88.0f, 168.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(88.0f)
                close()
            }
        }
        .build()
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null

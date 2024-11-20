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

public val BoldGroup.Swap: ImageVector
    get() {
        if (_swap != null) {
            return _swap!!
        }
        _swap = Builder(name = "Swap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 48.0f)
                verticalLineTo(152.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                horizontalLineTo(112.92f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.41f, 16.49f)
                lineToRelative(-20.0f, -20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineToRelative(20.0f, -20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 112.92f, 148.0f)
                horizontalLineTo(204.0f)
                verticalLineTo(52.0f)
                horizontalLineTo(100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 96.0f, 28.0f)
                horizontalLineTo(208.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 228.0f, 48.0f)
                close()
                moveTo(168.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(108.0f)
                horizontalLineToRelative(91.08f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.41f, 16.49f)
                lineToRelative(20.0f, -20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineToRelative(-20.0f, -20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 143.08f, 84.0f)
                horizontalLineTo(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineTo(208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(160.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineToRelative(-4.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 168.0f, 192.0f)
                close()
            }
        }
        .build()
        return _swap!!
    }

private var _swap: ImageVector? = null

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

public val BoldGroup.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(112.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 100.0f)
                close()
                moveTo(236.0f, 68.0f)
                verticalLineTo(196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                horizontalLineTo(40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineTo(68.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 48.0f)
                horizontalLineTo(76.0f)
                verticalLineTo(40.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, -28.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 236.0f, 68.0f)
                close()
                moveTo(100.0f, 48.0f)
                horizontalLineToRelative(56.0f)
                verticalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                close()
                moveTo(44.0f, 72.0f)
                verticalLineToRelative(35.23f)
                arcTo(180.06f, 180.06f, 0.0f, false, false, 128.0f, 128.0f)
                arcToRelative(180.0f, 180.0f, 0.0f, false, false, 84.0f, -20.78f)
                verticalLineTo(72.0f)
                close()
                moveTo(212.0f, 192.0f)
                verticalLineTo(133.94f)
                arcTo(204.27f, 204.27f, 0.0f, false, true, 128.0f, 152.0f)
                arcToRelative(204.21f, 204.21f, 0.0f, false, true, -84.0f, -18.06f)
                verticalLineTo(192.0f)
                close()
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null

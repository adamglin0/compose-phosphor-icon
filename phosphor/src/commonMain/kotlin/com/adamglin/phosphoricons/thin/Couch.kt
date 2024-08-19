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

public val ThinGroup.Couch: ImageVector
    get() {
        if (_couch != null) {
            return _couch!!
        }
        _couch = Builder(name = "Couch", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 108.7f)
                verticalLineTo(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 72.0f)
                verticalLineToRelative(36.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 120.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(36.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(180.0f)
                horizontalLineTo(212.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(180.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 236.0f, 108.7f)
                close()
                moveTo(228.0f, 72.0f)
                verticalLineToRelative(36.0f)
                horizontalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(20.0f)
                horizontalLineTo(132.0f)
                verticalLineTo(68.0f)
                horizontalLineToRelative(92.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 72.0f)
                close()
                moveTo(32.0f, 68.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(72.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(28.0f)
                verticalLineTo(72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 32.0f, 68.0f)
                close()
                moveTo(236.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _couch!!
    }

private var _couch: ImageVector? = null

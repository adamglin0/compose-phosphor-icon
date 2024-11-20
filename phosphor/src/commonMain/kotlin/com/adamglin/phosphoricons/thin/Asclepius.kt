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

public val ThinGroup.Asclepius: ImageVector
    get() {
        if (_asclepius != null) {
            return _asclepius!!
        }
        _asclepius = Builder(name = "Asclepius", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 79.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f)
                horizontalLineTo(132.0f)
                verticalLineToRelative(88.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 13.33f, -34.91f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.34f, -6.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 144.0f, 212.0f)
                horizontalLineTo(132.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(212.0f)
                horizontalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(28.0f)
                verticalLineTo(116.0f)
                horizontalLineTo(96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, -56.0f)
                horizontalLineToRelative(28.0f)
                verticalLineTo(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(84.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                verticalLineTo(79.0f)
                arcToRelative(27.0f, 27.0f, 0.0f, false, false, -27.0f, -27.0f)
                horizontalLineTo(160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(35.0f, 35.0f, 0.0f, false, true, 35.0f, 35.0f)
                close()
                moveTo(56.0f, 92.0f)
                horizontalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(80.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 64.0f, 44.0f)
                horizontalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(92.0f)
                verticalLineToRelative(4.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 56.0f, 92.0f)
                close()
                moveTo(84.0f, 56.0f)
                verticalLineTo(52.0f)
                horizontalLineTo(64.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 36.0f, 80.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(56.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 84.0f, 56.0f)
                close()
            }
        }
        .build()
        return _asclepius!!
    }

private var _asclepius: ImageVector? = null

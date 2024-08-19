package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Lamppendant: ImageVector
    get() {
        if (_lamppendant != null) {
            return _lamppendant!!
        }
        _lamppendant = Builder(name = "Lamppendant", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 74.78f)
                verticalLineTo(72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(56.0f)
                horizontalLineTo(96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 80.0f, 72.0f)
                verticalLineToRelative(2.78f)
                arcTo(111.73f, 111.73f, 0.0f, false, false, 16.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(88.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 80.0f, 0.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                arcTo(111.73f, 111.73f, 0.0f, false, false, 176.0f, 74.78f)
                close()
                moveTo(128.0f, 208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                horizontalLineToRelative(48.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 208.0f)
                close()
                moveTo(32.33f, 168.0f)
                arcTo(95.79f, 95.79f, 0.0f, false, true, 91.08f, 87.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 80.0f)
                verticalLineTo(72.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.92f, 7.38f)
                arcTo(95.79f, 95.79f, 0.0f, false, true, 223.67f, 168.0f)
                close()
            }
        }
        .build()
        return _lamppendant!!
    }

private var _lamppendant: ImageVector? = null

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

public val RegularGroup.Usersquare: ImageVector
    get() {
        if (_usersquare != null) {
            return _usersquare!!
        }
        _usersquare = Builder(name = "Usersquare", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                horizontalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(96.0f, 120.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 120.0f)
                close()
                moveTo(68.67f, 208.0f)
                arcTo(64.36f, 64.36f, 0.0f, false, true, 87.8f, 182.2f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 80.4f, 0.0f)
                arcTo(64.36f, 64.36f, 0.0f, false, true, 187.33f, 208.0f)
                close()
                moveTo(208.0f, 208.0f)
                horizontalLineToRelative(-3.67f)
                arcToRelative(79.9f, 79.9f, 0.0f, false, false, -46.68f, -50.29f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -59.3f, 0.0f)
                arcTo(79.9f, 79.9f, 0.0f, false, false, 51.67f, 208.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(48.0f)
                horizontalLineTo(208.0f)
                verticalLineTo(208.0f)
                close()
            }
        }
        .build()
        return _usersquare!!
    }

private var _usersquare: ImageVector? = null

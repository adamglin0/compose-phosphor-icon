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

public val RegularGroup.Userrectangle: ImageVector
    get() {
        if (_userrectangle != null) {
            return _userrectangle!!
        }
        _userrectangle = Builder(name = "Userrectangle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(96.0f, 120.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 120.0f)
                close()
                moveTo(72.57f, 200.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 110.86f, 0.0f)
                close()
                moveTo(216.0f, 200.0f)
                horizontalLineTo(201.33f)
                arcToRelative(80.14f, 80.14f, 0.0f, false, false, -43.69f, -42.28f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -59.28f, 0.0f)
                arcTo(80.14f, 80.14f, 0.0f, false, false, 54.67f, 200.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(56.0f)
                horizontalLineTo(216.0f)
                verticalLineTo(200.0f)
                close()
            }
        }
        .build()
        return _userrectangle!!
    }

private var _userrectangle: ImageVector? = null

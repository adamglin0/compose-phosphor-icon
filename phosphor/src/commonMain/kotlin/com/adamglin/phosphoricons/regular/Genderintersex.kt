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

public val RegularGroup.GenderIntersex: ImageVector
    get() {
        if (_genderIntersex != null) {
            return _genderIntersex!!
        }
        _genderIntersex = Builder(name = "GenderIntersex", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 24.0f)
                horizontalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(20.69f)
                lineTo(163.54f, 65.15f)
                arcTo(64.0f, 64.0f, 0.0f, true, false, 112.0f, 175.48f)
                verticalLineTo(192.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(208.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(175.48f)
                arcToRelative(63.92f, 63.92f, 0.0f, false, false, 45.84f, -98.0f)
                lineTo(200.0f, 51.31f)
                verticalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 24.0f)
                close()
                moveTo(120.0f, 160.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, -48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 120.0f, 160.0f)
                close()
            }
        }
        .build()
        return _genderIntersex!!
    }

private var _genderIntersex: ImageVector? = null

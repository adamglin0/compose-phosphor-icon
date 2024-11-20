package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.TeaBag: ImageVector
    get() {
        if (_teaBag != null) {
            return _teaBag!!
        }
        _teaBag = Builder(name = "TeaBag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 162.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -18.0f, -18.0f)
                verticalLineTo(64.0f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 98.0f, 64.0f)
                verticalLineTo(74.0f)
                horizontalLineTo(76.53f)
                arcToRelative(14.07f, 14.07f, 0.0f, false, false, -12.0f, 6.8f)
                lineTo(44.0f, 115.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -2.0f, 7.21f)
                verticalLineTo(216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(122.22f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -2.0f, -7.21f)
                lineTo(143.48f, 80.8f)
                arcToRelative(14.07f, 14.07f, 0.0f, false, false, -12.0f, -6.8f)
                horizontalLineTo(110.0f)
                verticalLineTo(64.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 84.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 30.0f, 30.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(131.47f, 86.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.72f, 1.0f)
                lineToRelative(20.53f, 34.22f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.28f, 1.0f)
                verticalLineTo(216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(122.22f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.29f, -1.0f)
                lineTo(74.81f, 87.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.72f, -1.0f)
                horizontalLineTo(98.0f)
                verticalLineToRelative(50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(86.0f)
                close()
            }
        }
        .build()
        return _teaBag!!
    }

private var _teaBag: ImageVector? = null

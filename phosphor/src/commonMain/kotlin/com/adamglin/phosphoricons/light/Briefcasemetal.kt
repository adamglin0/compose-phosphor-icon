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

public val LightGroup.Briefcasemetal: ImageVector
    get() {
        if (_briefcasemetal != null) {
            return _briefcasemetal!!
        }
        _briefcasemetal = Builder(name = "Briefcasemetal", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 58.0f)
                horizontalLineTo(174.0f)
                verticalLineTo(48.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, -22.0f)
                horizontalLineTo(104.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 82.0f, 48.0f)
                verticalLineTo(58.0f)
                horizontalLineTo(40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 72.0f)
                verticalLineTo(200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(72.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 58.0f)
                close()
                moveTo(38.0f, 110.0f)
                horizontalLineTo(218.0f)
                verticalLineToRelative(52.0f)
                horizontalLineTo(38.0f)
                close()
                moveTo(94.0f, 48.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, -10.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                verticalLineTo(58.0f)
                horizontalLineTo(94.0f)
                close()
                moveTo(40.0f, 70.0f)
                horizontalLineTo(216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineTo(98.0f)
                horizontalLineTo(38.0f)
                verticalLineTo(72.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 40.0f, 70.0f)
                close()
                moveTo(216.0f, 202.0f)
                horizontalLineTo(40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(174.0f)
                horizontalLineTo(218.0f)
                verticalLineToRelative(26.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 202.0f)
                close()
            }
        }
        .build()
        return _briefcasemetal!!
    }

private var _briefcasemetal: ImageVector? = null

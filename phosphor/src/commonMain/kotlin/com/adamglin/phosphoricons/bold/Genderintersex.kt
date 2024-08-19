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

public val BoldGroup.Genderintersex: ImageVector
    get() {
        if (_genderintersex != null) {
            return _genderintersex!!
        }
        _genderintersex = Builder(name = "Genderintersex", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 20.0f)
                horizontalLineTo(168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(11.0f)
                lineTo(163.36f, 59.67f)
                arcTo(68.0f, 68.0f, 0.0f, true, false, 108.0f, 178.92f)
                verticalLineTo(192.0f)
                horizontalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(216.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(132.0f)
                verticalLineTo(178.92f)
                arcTo(67.93f, 67.93f, 0.0f, false, false, 178.9f, 78.08f)
                lineTo(196.0f, 61.0f)
                verticalLineTo(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 20.0f)
                close()
                moveTo(120.0f, 156.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, -44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 120.0f, 156.0f)
                close()
            }
        }
        .build()
        return _genderintersex!!
    }

private var _genderintersex: ImageVector? = null

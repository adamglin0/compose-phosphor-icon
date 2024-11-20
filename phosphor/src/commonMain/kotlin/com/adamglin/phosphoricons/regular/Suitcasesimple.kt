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

public val RegularGroup.SuitcaseSimple: ImageVector
    get() {
        if (_suitcaseSimple != null) {
            return _suitcaseSimple!!
        }
        _suitcaseSimple = Builder(name = "SuitcaseSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 56.0f)
                lineTo(176.0f, 56.0f)
                lineTo(176.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                lineTo(104.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 80.0f, 48.0f)
                verticalLineToRelative(8.0f)
                lineTo(40.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 72.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 56.0f)
                close()
                moveTo(96.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(8.0f)
                lineTo(96.0f, 56.0f)
                close()
                moveTo(216.0f, 72.0f)
                verticalLineToRelative(72.0f)
                lineTo(40.0f, 144.0f)
                lineTo(40.0f, 72.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 160.0f)
                lineTo(216.0f, 160.0f)
                verticalLineToRelative(40.0f)
                close()
            }
        }
        .build()
        return _suitcaseSimple!!
    }

private var _suitcaseSimple: ImageVector? = null

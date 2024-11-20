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

public val ThinGroup.GridNine: ImageVector
    get() {
        if (_gridNine != null) {
            return _gridNine!!
        }
        _gridNine = Builder(name = "GridNine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 52.0f)
                lineTo(40.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 64.0f)
                lineTo(28.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(216.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 52.0f)
                close()
                moveTo(100.0f, 148.0f)
                lineTo(100.0f, 108.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(156.0f, 156.0f)
                verticalLineToRelative(40.0f)
                lineTo(100.0f, 196.0f)
                lineTo(100.0f, 156.0f)
                close()
                moveTo(36.0f, 108.0f)
                lineTo(92.0f, 108.0f)
                verticalLineToRelative(40.0f)
                lineTo(36.0f, 148.0f)
                close()
                moveTo(100.0f, 100.0f)
                lineTo(100.0f, 60.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(164.0f, 108.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(40.0f)
                lineTo(164.0f, 148.0f)
                close()
                moveTo(220.0f, 64.0f)
                verticalLineToRelative(36.0f)
                lineTo(164.0f, 100.0f)
                lineTo(164.0f, 60.0f)
                horizontalLineToRelative(52.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 64.0f)
                close()
                moveTo(40.0f, 60.0f)
                lineTo(92.0f, 60.0f)
                verticalLineToRelative(40.0f)
                lineTo(36.0f, 100.0f)
                lineTo(36.0f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 60.0f)
                close()
                moveTo(36.0f, 192.0f)
                lineTo(36.0f, 156.0f)
                lineTo(92.0f, 156.0f)
                verticalLineToRelative(40.0f)
                lineTo(40.0f, 196.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 192.0f)
                close()
                moveTo(216.0f, 196.0f)
                lineTo(164.0f, 196.0f)
                lineTo(164.0f, 156.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(36.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 196.0f)
                close()
            }
        }
        .build()
        return _gridNine!!
    }

private var _gridNine: ImageVector? = null

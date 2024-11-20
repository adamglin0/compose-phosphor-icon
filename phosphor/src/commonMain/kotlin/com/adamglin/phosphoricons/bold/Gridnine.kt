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

public val BoldGroup.GridNine: ImageVector
    get() {
        if (_gridNine != null) {
            return _gridNine!!
        }
        _gridNine = Builder(name = "GridNine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 64.0f)
                lineTo(20.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(108.0f, 140.0f)
                lineTo(108.0f, 116.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(148.0f, 164.0f)
                verticalLineToRelative(24.0f)
                lineTo(108.0f, 188.0f)
                lineTo(108.0f, 164.0f)
                close()
                moveTo(44.0f, 116.0f)
                lineTo(84.0f, 116.0f)
                verticalLineToRelative(24.0f)
                lineTo(44.0f, 140.0f)
                close()
                moveTo(108.0f, 92.0f)
                lineTo(108.0f, 68.0f)
                horizontalLineToRelative(40.0f)
                lineTo(148.0f, 92.0f)
                close()
                moveTo(172.0f, 116.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(24.0f)
                lineTo(172.0f, 140.0f)
                close()
                moveTo(212.0f, 92.0f)
                lineTo(172.0f, 92.0f)
                lineTo(172.0f, 68.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(84.0f, 68.0f)
                lineTo(84.0f, 92.0f)
                lineTo(44.0f, 92.0f)
                lineTo(44.0f, 68.0f)
                close()
                moveTo(44.0f, 164.0f)
                lineTo(84.0f, 164.0f)
                verticalLineToRelative(24.0f)
                lineTo(44.0f, 188.0f)
                close()
                moveTo(172.0f, 188.0f)
                lineTo(172.0f, 164.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _gridNine!!
    }

private var _gridNine: ImageVector? = null

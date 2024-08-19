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

public val BoldGroup.Belt: ImageVector
    get() {
        if (_belt != null) {
            return _belt!!
        }
        _belt = Builder(name = "Belt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 156.0f)
                lineTo(196.0f, 156.0f)
                lineTo(196.0f, 100.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(192.0f, 76.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -16.0f, -8.0f)
                lineTo(112.0f, 68.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -16.0f, 8.0f)
                lineTo(67.3f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -22.6f, 0.0f)
                lineTo(12.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(44.0f, 100.0f)
                verticalLineToRelative(56.0f)
                lineTo(12.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(44.7f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.6f, 0.0f)
                lineTo(96.0f, 180.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.0f, -8.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(68.0f, 100.0f)
                lineTo(92.0f, 100.0f)
                verticalLineToRelative(56.0f)
                lineTo(68.0f, 156.0f)
                close()
                moveTo(116.0f, 92.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(24.0f)
                lineTo(144.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(24.0f)
                lineTo(116.0f, 164.0f)
                close()
            }
        }
        .build()
        return _belt!!
    }

private var _belt: ImageVector? = null

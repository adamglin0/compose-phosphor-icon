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

public val BoldGroup.Lockers: ImageVector
    get() {
        if (_lockers != null) {
            return _lockers!!
        }
        _lockers = Builder(name = "Lockers", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(164.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(16.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 80.0f)
                close()
                moveTo(180.0f, 108.0f)
                lineTo(164.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(76.0f, 92.0f)
                lineTo(92.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(76.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(92.0f, 108.0f)
                lineTo(76.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(92.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(228.0f, 48.0f)
                lineTo(228.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(204.0f, 212.0f)
                lineTo(140.0f, 212.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 212.0f)
                lineTo(52.0f, 212.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(28.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 48.0f, 28.0f)
                lineTo(208.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 228.0f, 48.0f)
                close()
                moveTo(116.0f, 188.0f)
                lineTo(116.0f, 52.0f)
                lineTo(52.0f, 52.0f)
                lineTo(52.0f, 188.0f)
                close()
                moveTo(140.0f, 188.0f)
                horizontalLineToRelative(64.0f)
                lineTo(204.0f, 52.0f)
                lineTo(140.0f, 52.0f)
                close()
            }
        }
        .build()
        return _lockers!!
    }

private var _lockers: ImageVector? = null

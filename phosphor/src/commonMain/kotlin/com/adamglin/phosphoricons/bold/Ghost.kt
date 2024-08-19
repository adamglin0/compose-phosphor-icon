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

public val BoldGroup.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 116.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 116.0f, 116.0f)
                close()
                moveTo(156.0f, 100.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 156.0f, 100.0f)
                close()
                moveTo(228.0f, 120.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.6f, 9.29f)
                lineTo(186.67f, 207.5f)
                lineToRelative(-21.74f, 17.79f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.2f, 0.0f)
                lineTo(128.0f, 207.5f)
                lineToRelative(-21.73f, 17.79f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.2f, 0.0f)
                lineTo(69.33f, 207.5f)
                lineTo(47.6f, 225.29f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 28.0f, 216.0f)
                lineTo(28.0f, 120.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, true, 200.0f, 0.0f)
                close()
                moveTo(204.0f, 120.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -152.0f, 0.0f)
                verticalLineToRelative(70.68f)
                lineToRelative(9.73f, -8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.2f, 0.0f)
                lineTo(98.67f, 200.5f)
                lineToRelative(21.73f, -17.79f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.2f, 0.0f)
                lineToRelative(21.73f, 17.79f)
                lineToRelative(21.74f, -17.79f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.2f, 0.0f)
                lineToRelative(9.73f, 8.0f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null

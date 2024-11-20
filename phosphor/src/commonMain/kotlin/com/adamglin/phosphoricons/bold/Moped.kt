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

public val BoldGroup.Moped: ImageVector
    get() {
        if (_moped != null) {
            return _moped!!
        }
        _moped = Builder(name = "Moped", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 124.0f)
                curveToRelative(-1.22f, 0.0f, -2.43f, 0.06f, -3.62f, 0.16f)
                lineTo(175.24f, 35.79f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 28.0f)
                lineTo(132.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(23.68f)
                lineToRelative(30.23f, 80.6f)
                arcTo(44.28f, 44.28f, 0.0f, false, false, 171.0f, 152.0f)
                horizontalLineToRelative(-29.2f)
                lineTo(119.24f, 91.79f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 108.0f, 84.0f)
                lineTo(28.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.92f)
                arcTo(60.14f, 60.14f, 0.0f, false, false, 0.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(4.74f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 86.52f, 0.0f)
                horizontalLineToRelative(65.48f)
                arcTo(44.0f, 44.0f, 0.0f, true, false, 212.0f, 124.0f)
                close()
                moveTo(48.0f, 130.05f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.0f, -11.32f)
                lineTo(56.0f, 108.0f)
                lineTo(99.68f, 108.0f)
                lineToRelative(16.5f, 44.0f)
                lineTo(26.06f, 152.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 48.0f, 130.05f)
                close()
                moveTo(60.0f, 188.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -18.32f, -12.0f)
                lineTo(78.32f, 176.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 60.0f, 188.0f)
                close()
                moveTo(212.0f, 188.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 212.0f, 188.0f)
                close()
            }
        }
        .build()
        return _moped!!
    }

private var _moped: ImageVector? = null

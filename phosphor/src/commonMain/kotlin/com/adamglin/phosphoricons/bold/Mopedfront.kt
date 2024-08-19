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

public val BoldGroup.Mopedfront: ImageVector
    get() {
        if (_mopedfront != null) {
            return _mopedfront!!
        }
        _mopedfront = Builder(name = "Mopedfront", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(170.32f, 36.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -84.64f, 0.0f)
                lineTo(48.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(85.68f, 60.0f)
                arcToRelative(43.89f, 43.89f, 0.0f, false, false, 9.0f, 16.73f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 60.0f, 136.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(96.0f, 220.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(196.0f, 136.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -34.72f, -59.27f)
                arcToRelative(43.89f, 43.89f, 0.0f, false, false, 9.0f, -16.73f)
                lineTo(208.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(136.0f, 220.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(172.0f, 196.0f)
                lineTo(160.0f, 196.0f)
                lineTo(160.0f, 164.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                verticalLineToRelative(32.0f)
                lineTo(84.0f, 196.0f)
                lineTo(84.0f, 136.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 88.0f, 0.0f)
                close()
                moveTo(108.0f, 48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 108.0f, 48.0f)
                close()
            }
        }
        .build()
        return _mopedfront!!
    }

private var _mopedfront: ImageVector? = null

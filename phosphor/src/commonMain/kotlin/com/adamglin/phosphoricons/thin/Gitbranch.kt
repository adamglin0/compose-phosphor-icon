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

public val ThinGroup.Gitbranch: ImageVector
    get() {
        if (_gitbranch != null) {
            return _gitbranch!!
        }
        _gitbranch = Builder(name = "Gitbranch", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 64.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -32.0f, 27.71f)
                lineTo(196.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(96.0f, 124.0f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, false, -12.0f, 4.0f)
                lineTo(84.0f, 91.71f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -8.0f, 0.0f)
                verticalLineToRelative(72.58f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 8.0f, 0.0f)
                lineTo(84.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(204.0f, 91.71f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 228.0f, 64.0f)
                close()
                moveTo(60.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 80.0f, 84.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 60.0f, 64.0f)
                close()
                moveTo(100.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 100.0f, 192.0f)
                close()
                moveTo(200.0f, 84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 200.0f, 84.0f)
                close()
            }
        }
        .build()
        return _gitbranch!!
    }

private var _gitbranch: ImageVector? = null

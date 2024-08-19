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

public val BoldGroup.Gitmerge: ImageVector
    get() {
        if (_gitmerge != null) {
            return _gitmerge!!
        }
        _gitmerge = Builder(name = "Gitmerge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 108.0f)
                arcToRelative(36.05f, 36.05f, 0.0f, false, false, -33.38f, 22.54f)
                lineToRelative(-39.0f, -5.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.47f, -1.35f)
                lineTo(100.55f, 85.53f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 68.0f, 89.94f)
                verticalLineToRelative(76.12f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 24.0f, 0.0f)
                lineTo(92.0f, 112.44f)
                lineToRelative(23.0f, 26.8f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 17.3f, 9.49f)
                lineToRelative(41.34f, 5.91f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 208.0f, 108.0f)
                close()
                moveTo(80.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 68.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 44.0f)
                close()
                moveTo(80.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 212.0f)
                close()
                moveTo(208.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 208.0f, 156.0f)
                close()
            }
        }
        .build()
        return _gitmerge!!
    }

private var _gitmerge: ImageVector? = null

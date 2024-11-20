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

public val ThinGroup.Signpost: ImageVector
    get() {
        if (_signpost != null) {
            return _signpost!!
        }
        _signpost = Builder(name = "Signpost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.0f, 109.32f)
                lineTo(209.36f, 72.0f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, false, -8.92f, -4.0f)
                lineTo(132.0f, 68.0f)
                lineTo(132.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(124.0f, 68.0f)
                lineTo(40.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 80.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(84.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 156.0f)
                horizontalLineToRelative(68.44f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, false, 8.92f, -4.0f)
                lineTo(243.0f, 114.68f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 243.0f, 109.32f)
                close()
                moveTo(203.44f, 146.68f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, 1.32f)
                lineTo(40.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(200.44f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, 1.32f)
                lineTo(234.62f, 112.0f)
                close()
            }
        }
        .build()
        return _signpost!!
    }

private var _signpost: ImageVector? = null

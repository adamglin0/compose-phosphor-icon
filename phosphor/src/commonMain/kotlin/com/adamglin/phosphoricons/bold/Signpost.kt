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

public val BoldGroup.Signpost: ImageVector
    get() {
        if (_signpost != null) {
            return _signpost!!
        }
        _signpost = Builder(name = "Signpost", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.92f, 104.0f)
                lineTo(215.3f, 66.62f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.44f, 60.0f)
                lineTo(140.0f, 60.0f)
                lineTo(140.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(116.0f, 60.0f)
                lineTo(40.0f, 60.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 80.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(76.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 164.0f)
                horizontalLineToRelative(60.44f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 14.86f, -6.62f)
                lineTo(248.92f, 120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 248.92f, 104.0f)
                close()
                moveTo(198.66f, 140.0f)
                lineTo(44.0f, 140.0f)
                lineTo(44.0f, 84.0f)
                lineTo(198.66f, 84.0f)
                lineToRelative(25.2f, 28.0f)
                close()
            }
        }
        .build()
        return _signpost!!
    }

private var _signpost: ImageVector? = null

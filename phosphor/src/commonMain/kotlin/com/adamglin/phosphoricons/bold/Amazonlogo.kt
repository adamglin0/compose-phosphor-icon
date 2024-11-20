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

public val BoldGroup.AmazonLogo: ImageVector
    get() {
        if (_amazonLogo != null) {
            return _amazonLogo!!
        }
        _amazonLogo = Builder(name = "AmazonLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 168.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineToRelative(-3.09f)
                curveTo(215.56f, 208.41f, 180.25f, 236.0f, 128.0f, 236.0f)
                curveToRelative(-64.6f, 0.0f, -103.3f, -42.18f, -104.92f, -44.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 40.92f, 176.0f)
                curveToRelative(0.3f, 0.33f, 33.48f, 36.0f, 87.08f, 36.0f)
                curveToRelative(42.65f, 0.0f, 72.34f, -22.58f, 82.87f, -32.0f)
                horizontalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 168.0f)
                close()
                moveTo(156.0f, 86.08f)
                verticalLineTo(84.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 97.17f, 66.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.11f, -13.1f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 180.0f, 84.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -23.85f, 1.81f)
                arcTo(56.0f, 56.0f, 0.0f, true, true, 156.0f, 86.08f)
                close()
                moveTo(156.0f, 132.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 156.0f, 132.0f)
                close()
            }
        }
        .build()
        return _amazonLogo!!
    }

private var _amazonLogo: ImageVector? = null

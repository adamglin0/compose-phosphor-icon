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

public val BoldGroup.ReplitLogo: ImageVector
    get() {
        if (_replitLogo != null) {
            return _replitLogo!!
        }
        _replitLogo = Builder(name = "ReplitLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 84.0f)
                lineTo(156.0f, 84.0f)
                lineTo(156.0f, 40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(72.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 52.0f, 40.0f)
                lineTo(52.0f, 88.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(60.0f)
                verticalLineToRelative(40.0f)
                lineTo(72.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(156.0f, 172.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 104.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 84.0f)
                close()
                moveTo(132.0f, 212.0f)
                lineTo(76.0f, 212.0f)
                lineTo(76.0f, 172.0f)
                horizontalLineToRelative(56.0f)
                close()
                moveTo(132.0f, 84.0f)
                lineTo(76.0f, 84.0f)
                lineTo(76.0f, 44.0f)
                horizontalLineToRelative(56.0f)
                close()
                moveTo(212.0f, 148.0f)
                lineTo(156.0f, 148.0f)
                lineTo(156.0f, 108.0f)
                horizontalLineToRelative(56.0f)
                close()
            }
        }
        .build()
        return _replitLogo!!
    }

private var _replitLogo: ImageVector? = null

package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.LockLaminatedOpen: ImageVector
    get() {
        if (_lockLaminatedOpen != null) {
            return _lockLaminatedOpen!!
        }
        _lockLaminatedOpen = Builder(name = "LockLaminatedOpen", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 80.0f)
                lineTo(96.0f, 80.0f)
                lineTo(96.0f, 56.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                curveToRelative(15.37f, 0.0f, 29.2f, 11.0f, 32.16f, 25.59f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.68f, -3.18f)
                curveTo(171.32f, 24.15f, 151.2f, 8.0f, 128.0f, 8.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, false, 80.0f, 56.0f)
                lineTo(80.0f, 80.0f)
                lineTo(48.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 96.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 80.0f)
                close()
                moveTo(48.0f, 128.0f)
                lineTo(208.0f, 128.0f)
                verticalLineToRelative(16.0f)
                lineTo(48.0f, 144.0f)
                close()
                moveTo(48.0f, 160.0f)
                lineTo(208.0f, 160.0f)
                verticalLineToRelative(16.0f)
                lineTo(48.0f, 176.0f)
                close()
                moveTo(208.0f, 96.0f)
                verticalLineToRelative(16.0f)
                lineTo(48.0f, 112.0f)
                lineTo(48.0f, 96.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 192.0f)
                lineTo(208.0f, 192.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _lockLaminatedOpen!!
    }

private var _lockLaminatedOpen: ImageVector? = null

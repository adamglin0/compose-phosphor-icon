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

public val BoldGroup.Checks: ImageVector
    get() {
        if (_checks != null) {
            return _checks!!
        }
        _checks = Builder(name = "Checks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.41f, 88.56f)
                lineToRelative(-89.6f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.82f, 0.0f)
                lineTo(7.59f, 138.85f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.82f, -17.13f)
                lineToRelative(30.0f, 29.46f)
                lineToRelative(81.19f, -79.74f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.82f, 17.12f)
                close()
                moveTo(248.56f, 71.56f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -0.15f)
                lineTo(150.4f, 151.18f)
                lineToRelative(-7.88f, -7.74f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.82f, 17.12f)
                lineToRelative(16.29f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.82f, 0.0f)
                lineToRelative(89.6f, -88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 248.56f, 71.59f)
                close()
            }
        }
        .build()
        return _checks!!
    }

private var _checks: ImageVector? = null

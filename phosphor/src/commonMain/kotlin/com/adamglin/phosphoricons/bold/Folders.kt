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

public val BoldGroup.Folders: ImageVector
    get() {
        if (_folders != null) {
            return _folders!!
        }
        _folders = Builder(name = "Folders", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 56.0f)
                lineTo(160.0f, 56.0f)
                lineTo(133.33f, 36.0f)
                arcToRelative(20.12f, 20.12f, 0.0f, false, false, -12.0f, -4.0f)
                lineTo(76.0f, 32.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 56.0f, 52.0f)
                lineTo(56.0f, 72.0f)
                lineTo(36.0f, 72.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 16.0f, 92.0f)
                lineTo(16.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(188.89f, 224.0f)
                arcTo(19.13f, 19.13f, 0.0f, false, false, 208.0f, 204.89f)
                lineTo(208.0f, 184.0f)
                horizontalLineToRelative(20.89f)
                arcTo(19.13f, 19.13f, 0.0f, false, false, 248.0f, 164.89f)
                lineTo(248.0f, 76.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 228.0f, 56.0f)
                close()
                moveTo(184.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 96.0f)
                lineTo(80.0f, 96.0f)
                lineToRelative(28.8f, 21.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 116.0f, 120.0f)
                horizontalLineToRelative(68.0f)
                close()
                moveTo(224.0f, 160.0f)
                lineTo(208.0f, 160.0f)
                lineTo(208.0f, 116.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(120.0f, 96.0f)
                lineTo(93.33f, 76.0f)
                arcToRelative(20.12f, 20.12f, 0.0f, false, false, -12.0f, -4.0f)
                lineTo(80.0f, 72.0f)
                lineTo(80.0f, 56.0f)
                horizontalLineToRelative(40.0f)
                lineToRelative(28.8f, 21.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 156.0f, 80.0f)
                horizontalLineToRelative(68.0f)
                close()
            }
        }
        .build()
        return _folders!!
    }

private var _folders: ImageVector? = null

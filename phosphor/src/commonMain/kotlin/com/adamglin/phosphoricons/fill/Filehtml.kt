package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Filehtml: ImageVector
    get() {
        if (_filehtml != null) {
            return _filehtml!!
        }
        _filehtml = Builder(name = "Filehtml", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 128.0f)
                lineTo(212.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(216.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(84.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 44.0f, 128.0f)
                close()
                moveTo(152.0f, 44.0f)
                lineToRelative(44.0f, 44.0f)
                lineTo(152.0f, 88.0f)
                close()
                moveTo(68.0f, 160.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(52.0f, 192.0f)
                lineTo(32.0f, 192.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(16.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(16.0f)
                lineTo(52.0f, 176.0f)
                lineTo(52.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(124.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(92.0f, 168.0f)
                lineTo(84.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 124.0f, 160.0f)
                close()
                moveTo(196.0f, 160.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(180.0f, 184.0f)
                lineToRelative(-9.6f, 12.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.8f, 0.0f)
                lineTo(148.0f, 184.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(132.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.4f, -4.8f)
                lineTo(164.0f, 178.67f)
                lineToRelative(17.6f, -23.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 196.0f, 160.0f)
                close()
                moveTo(252.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(208.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 252.0f, 208.0f)
                close()
            }
        }
        .build()
        return _filehtml!!
    }

private var _filehtml: ImageVector? = null

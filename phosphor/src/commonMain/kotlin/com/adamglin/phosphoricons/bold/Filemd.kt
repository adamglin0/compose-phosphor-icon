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

public val BoldGroup.Filemd: ImageVector
    get() {
        if (_filemd != null) {
            return _filemd!!
        }
        _filemd = Builder(name = "Filemd", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 152.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(76.0f, 190.07f)
                lineToRelative(-6.17f, 8.81f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.66f, 0.0f)
                lineTo(44.0f, 190.07f)
                lineTo(44.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(20.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 21.83f, -6.88f)
                lineTo(60.0f, 171.07f)
                lineToRelative(18.17f, -25.95f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 152.0f)
                close()
                moveTo(184.0f, 180.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f)
                lineTo(128.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(116.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(16.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 184.0f, 180.0f)
                close()
                moveTo(160.0f, 180.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(4.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 160.0f, 180.0f)
                close()
                moveTo(220.0f, 88.0f)
                lineTo(220.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(196.0f, 104.0f)
                lineTo(148.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(136.0f, 44.0f)
                lineTo(60.0f, 44.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(36.0f, 40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 56.0f, 20.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.49f, 3.52f)
                lineToRelative(56.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 88.0f)
                close()
                moveTo(160.0f, 80.0f)
                horizontalLineToRelative(23.0f)
                lineTo(160.0f, 57.0f)
                close()
            }
        }
        .build()
        return _filemd!!
    }

private var _filemd: ImageVector? = null

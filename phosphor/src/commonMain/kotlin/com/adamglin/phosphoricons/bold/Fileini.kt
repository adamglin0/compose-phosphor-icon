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

public val BoldGroup.Fileini: ImageVector
    get() {
        if (_fileini != null) {
            return _fileini!!
        }
        _fileini = Builder(name = "Fileini", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 152.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(24.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(120.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(18.55f)
                lineTo(89.76f, 145.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 152.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(92.0f, 189.45f)
                lineTo(110.24f, 215.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.76f, 5.0f)
                arcToRelative(12.15f, 12.15f, 0.0f, false, false, 3.66f, -0.57f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 132.0f, 208.0f)
                lineTo(132.0f, 152.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 120.0f, 140.0f)
                close()
                moveTo(164.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(176.0f, 152.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 140.0f)
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
        return _fileini!!
    }

private var _fileini: ImageVector? = null

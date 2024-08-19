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

public val BoldGroup.Filezip: ImageVector
    get() {
        if (_filezip != null) {
            return _filezip!!
        }
        _filezip = Builder(name = "Filezip", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 140.0f)
                lineTo(172.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, -64.0f)
                close()
                moveTo(188.0f, 180.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(184.0f, 164.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(140.0f, 152.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(96.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(52.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.42f, -17.95f)
                lineTo(63.32f, 164.0f)
                lineTo(52.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(84.0f, 140.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 94.42f, 158.0f)
                lineTo(72.68f, 196.0f)
                lineTo(84.0f, 196.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 208.0f)
                close()
                moveTo(216.49f, 79.52f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 152.0f, 20.0f)
                lineTo(56.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 40.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(60.0f, 44.0f)
                horizontalLineToRelative(76.0f)
                lineTo(136.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(220.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.49f, 79.52f)
                close()
                moveTo(160.0f, 80.0f)
                lineTo(160.0f, 57.0f)
                lineToRelative(23.0f, 23.0f)
                close()
            }
        }
        .build()
        return _filezip!!
    }

private var _filezip: ImageVector? = null

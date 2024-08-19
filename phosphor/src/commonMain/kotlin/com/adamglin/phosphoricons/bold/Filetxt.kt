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

public val BoldGroup.Filetxt: ImageVector
    get() {
        if (_filetxt != null) {
            return _filetxt!!
        }
        _filetxt = Builder(name = "Filetxt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(60.0f, 44.0f)
                horizontalLineToRelative(76.0f)
                lineTo(136.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(220.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.51f, -8.49f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 152.0f, 20.0f)
                lineTo(56.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 40.0f)
                verticalLineToRelative(68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 48.0f, 120.0f)
                close()
                moveTo(183.0f, 80.0f)
                lineTo(160.0f, 80.0f)
                lineTo(160.0f, 57.0f)
                close()
                moveTo(157.73f, 159.0f)
                lineTo(142.73f, 180.0f)
                lineTo(157.73f, 201.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 138.24f, 215.0f)
                lineTo(128.0f, 200.65f)
                lineTo(117.76f, 215.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 98.24f, 201.0f)
                lineToRelative(15.0f, -21.0f)
                lineToRelative(-15.0f, -21.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 117.76f, 145.0f)
                lineTo(128.0f, 159.35f)
                lineTo(138.24f, 145.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 157.76f, 159.0f)
                close()
                moveTo(92.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(72.0f, 164.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(48.0f, 164.0f)
                lineTo(40.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(80.0f, 140.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 152.0f)
                close()
                moveTo(228.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(184.0f, 164.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 152.0f)
                close()
            }
        }
        .build()
        return _filetxt!!
    }

private var _filetxt: ImageVector? = null

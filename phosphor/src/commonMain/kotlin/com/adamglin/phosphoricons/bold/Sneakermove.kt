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

public val BoldGroup.Sneakermove: ImageVector
    get() {
        if (_sneakermove != null) {
            return _sneakermove!!
        }
        _sneakermove = Builder(name = "Sneakermove", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.94f, 163.06f)
                lineToRelative(-28.62f, -14.31f)
                arcTo(43.78f, 43.78f, 0.0f, false, true, 180.0f, 109.39f)
                lineTo(180.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, -44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.25f, -9.56f)
                lineToRelative(-77.0f, 58.41f)
                lineToRelative(-0.3f, 0.23f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -1.56f, 29.69f)
                lineTo(139.57f, 216.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, 3.51f)
                lineTo(224.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(244.0f, 180.94f)
                arcTo(19.88f, 19.88f, 0.0f, false, false, 232.94f, 163.06f)
                close()
                moveTo(220.0f, 196.0f)
                lineTo(153.0f, 196.0f)
                lineTo(46.08f, 89.05f)
                lineToRelative(12.86f, -9.76f)
                lineToRelative(41.2f, 41.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f)
                lineTo(78.25f, 64.65f)
                lineToRelative(25.24f, -19.14f)
                arcTo(68.24f, 68.24f, 0.0f, false, false, 156.0f, 90.94f)
                verticalLineToRelative(18.45f)
                arcToRelative(67.62f, 67.62f, 0.0f, false, false, 37.59f, 60.82f)
                lineTo(220.0f, 183.42f)
                close()
                moveTo(55.49f, 184.0f)
                lineTo(32.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(55.49f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(103.49f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(48.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(91.49f, 196.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 103.49f, 208.0f)
                close()
            }
        }
        .build()
        return _sneakermove!!
    }

private var _sneakermove: ImageVector? = null

package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Fourk: ImageVector
    get() {
        if (_fourk != null) {
            return _fourk!!
        }
        _fourk = Builder(name = "Fourk", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(224.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(32.0f, 52.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 48.0f)
                close()
                moveTo(224.0f, 204.0f)
                lineTo(32.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(224.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(144.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(148.0f, 145.5f)
                lineToRelative(17.75f, -20.28f)
                lineTo(196.54f, 178.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.92f, -4.0f)
                lineTo(171.3f, 118.87f)
                lineTo(203.0f, 82.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.0f, -5.26f)
                lineToRelative(-49.0f, 56.0f)
                lineTo(148.0f, 80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 144.0f, 76.0f)
                close()
                moveTo(92.0f, 176.0f)
                lineTo(92.0f, 156.0f)
                lineTo(40.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.16f, -6.46f)
                lineToRelative(56.0f, -72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 100.0f, 80.0f)
                verticalLineToRelative(68.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(100.0f, 156.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(92.0f, 148.0f)
                lineTo(92.0f, 91.66f)
                lineTo(48.18f, 148.0f)
                close()
            }
        }
        .build()
        return _fourk!!
    }

private var _fourk: ImageVector? = null

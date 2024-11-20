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

public val ThinGroup.TrolleySuitcase: ImageVector
    get() {
        if (_trolleySuitcase != null) {
            return _trolleySuitcase!!
        }
        _trolleySuitcase = Builder(name = "TrolleySuitcase", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 156.0f)
                lineTo(216.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(180.0f, 60.0f)
                lineTo(180.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(136.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(124.0f, 60.0f)
                lineTo(88.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 76.0f, 72.0f)
                verticalLineToRelative(72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 156.0f)
                close()
                moveTo(132.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(172.0f, 60.0f)
                lineTo(132.0f, 60.0f)
                close()
                moveTo(84.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(88.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                close()
                moveTo(84.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 224.0f)
                close()
                moveTo(228.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 224.0f)
                close()
                moveTo(244.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(32.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(44.0f, 180.0f)
                lineTo(44.0f, 75.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.17f, -2.83f)
                lineTo(21.17f, 50.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(48.49f, 66.83f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 52.0f, 75.31f)
                lineTo(52.0f, 180.0f)
                lineTo(240.0f, 180.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 184.0f)
                close()
            }
        }
        .build()
        return _trolleySuitcase!!
    }

private var _trolleySuitcase: ImageVector? = null

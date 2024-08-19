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

public val ThinGroup.Chefhat: ImageVector
    get() {
        if (_chefhat != null) {
            return _chefhat!!
        }
        _chefhat = Builder(name = "Chefhat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 112.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, -52.0f, -52.0f)
                arcToRelative(53.0f, 53.0f, 0.0f, false, false, -7.77f, 0.59f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -96.46f, 0.0f)
                arcTo(53.0f, 53.0f, 0.0f, false, false, 72.0f, 60.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 52.0f, 160.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(192.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(204.0f, 160.0f)
                arcTo(52.07f, 52.07f, 0.0f, false, false, 236.0f, 112.0f)
                close()
                moveTo(196.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(64.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(60.0f, 162.59f)
                arcTo(52.13f, 52.13f, 0.0f, false, false, 72.0f, 164.0f)
                lineTo(184.0f, 164.0f)
                arcToRelative(52.13f, 52.13f, 0.0f, false, false, 12.0f, -1.41f)
                close()
                moveTo(184.0f, 156.0f)
                lineTo(165.12f, 156.0f)
                lineToRelative(6.76f, -27.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.76f, -1.94f)
                lineToRelative(-7.24f, 29.0f)
                lineTo(132.0f, 156.06f)
                lineTo(132.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(28.0f)
                lineTo(99.12f, 156.0f)
                lineToRelative(-7.24f, -29.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 84.12f, 129.0f)
                lineToRelative(6.76f, 27.0f)
                lineTo(72.0f, 156.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 0.0f, -88.0f)
                arcToRelative(45.3f, 45.3f, 0.0f, false, true, 5.34f, 0.33f)
                arcTo(51.68f, 51.68f, 0.0f, false, false, 76.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 88.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(51.68f, 51.68f, 0.0f, false, false, -1.34f, -11.67f)
                arcTo(45.3f, 45.3f, 0.0f, false, true, 184.0f, 68.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 0.0f, 88.0f)
                close()
            }
        }
        .build()
        return _chefhat!!
    }

private var _chefhat: ImageVector? = null

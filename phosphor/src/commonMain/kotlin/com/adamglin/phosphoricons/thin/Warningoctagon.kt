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

public val ThinGroup.Warningoctagon: ImageVector
    get() {
        if (_warningoctagon != null) {
            return _warningoctagon!!
        }
        _warningoctagon = Builder(name = "Warningoctagon", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 136.0f)
                lineTo(124.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(228.0f, 91.55f)
                verticalLineToRelative(72.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.51f, 8.49f)
                lineToRelative(-51.55f, 51.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.49f, 3.51f)
                lineTo(91.55f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.49f, -3.51f)
                lineTo(31.51f, 172.94f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 28.0f, 164.45f)
                lineTo(28.0f, 91.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.51f, -8.49f)
                lineTo(83.06f, 31.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 91.55f, 28.0f)
                horizontalLineToRelative(72.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.49f, 3.51f)
                lineToRelative(51.55f, 51.55f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 91.55f)
                close()
                moveTo(220.0f, 91.55f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.17f, -2.83f)
                lineTo(167.28f, 37.17f)
                arcTo(4.06f, 4.06f, 0.0f, false, false, 164.45f, 36.0f)
                lineTo(91.55f, 36.0f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, false, -2.83f, 1.17f)
                lineTo(37.17f, 88.72f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 36.0f, 91.55f)
                verticalLineToRelative(72.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.17f, 2.83f)
                lineToRelative(51.55f, 51.55f)
                arcTo(4.06f, 4.06f, 0.0f, false, false, 91.55f, 220.0f)
                horizontalLineToRelative(72.9f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, false, 2.83f, -1.17f)
                lineToRelative(51.55f, -51.55f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.17f, -2.83f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 164.0f)
                close()
            }
        }
        .build()
        return _warningoctagon!!
    }

private var _warningoctagon: ImageVector? = null

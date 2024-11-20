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

public val ThinGroup.TrainRegional: ImageVector
    get() {
        if (_trainRegional != null) {
            return _trainRegional!!
        }
        _trainRegional = Builder(name = "TrainRegional", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.86f, 119.0f)
                lineTo(197.47f, 36.84f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 185.89f, 28.0f)
                lineTo(70.11f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.58f, 8.84f)
                lineTo(36.14f, 119.0f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, false, 0.0f, 2.1f)
                lineToRelative(22.39f, 82.11f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 70.11f, 212.0f)
                lineTo(88.0f, 212.0f)
                lineTo(68.8f, 237.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.4f, 4.8f)
                lineTo(98.0f, 212.0f)
                horizontalLineToRelative(60.0f)
                lineToRelative(22.8f, 30.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.4f, -4.8f)
                lineTo(168.0f, 212.0f)
                horizontalLineToRelative(17.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.58f, -8.84f)
                lineToRelative(22.39f, -82.11f)
                arcTo(3.94f, 3.94f, 0.0f, false, false, 219.86f, 119.0f)
                close()
                moveTo(66.25f, 39.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.86f, -3.0f)
                lineTo(185.89f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.86f, 3.0f)
                lineTo(211.0f, 116.84f)
                lineToRelative(-83.0f, 15.09f)
                lineTo(45.0f, 116.84f)
                close()
                moveTo(66.25f, 201.1f)
                lineTo(45.53f, 125.1f)
                lineTo(124.0f, 139.34f)
                lineTo(124.0f, 204.0f)
                lineTo(70.11f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 66.25f, 201.05f)
                close()
                moveTo(189.75f, 201.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.86f, 2.95f)
                lineTo(132.0f, 204.05f)
                lineTo(132.0f, 139.34f)
                lineToRelative(78.47f, -14.27f)
                close()
                moveTo(92.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(96.0f, 92.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 92.0f, 88.0f)
                close()
            }
        }
        .build()
        return _trainRegional!!
    }

private var _trainRegional: ImageVector? = null

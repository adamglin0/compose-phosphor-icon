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

public val BoldGroup.Starofdavid: ImageVector
    get() {
        if (_starofdavid != null) {
            return _starofdavid!!
        }
        _starofdavid = Builder(name = "Starofdavid", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.82f, 128.0f)
                lineToRelative(28.6f, -50.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 60.0f)
                lineTo(167.0f, 60.0f)
                lineToRelative(-28.55f, -50.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 4.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.42f, 6.05f)
                lineTo(89.0f, 60.0f)
                lineTo(32.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 21.58f, 78.0f)
                lineToRelative(28.58f, 50.0f)
                lineTo(21.58f, 178.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 196.0f)
                lineTo(89.0f, 196.0f)
                lineToRelative(28.57f, 50.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.84f, 0.0f)
                lineTo(167.0f, 196.0f)
                horizontalLineToRelative(57.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.42f, -17.95f)
                close()
                moveTo(203.32f, 84.0f)
                lineTo(192.0f, 103.81f)
                lineTo(180.68f, 84.0f)
                close()
                moveTo(178.18f, 128.0f)
                lineTo(153.0f, 172.0f)
                horizontalLineToRelative(-50.1f)
                lineTo(77.81f, 128.0f)
                lineToRelative(25.13f, -44.0f)
                lineTo(153.0f, 84.0f)
                close()
                moveTo(128.0f, 40.18f)
                lineTo(139.33f, 60.0f)
                lineTo(116.66f, 60.0f)
                close()
                moveTo(52.68f, 84.0f)
                lineTo(75.29f, 84.0f)
                lineTo(64.0f, 103.82f)
                close()
                moveTo(52.68f, 171.92f)
                lineTo(64.0f, 152.18f)
                lineTo(75.29f, 172.0f)
                close()
                moveTo(128.0f, 215.82f)
                lineTo(116.66f, 196.0f)
                horizontalLineToRelative(22.67f)
                close()
                moveTo(180.68f, 172.0f)
                lineTo(192.0f, 152.19f)
                lineTo(203.32f, 172.0f)
                close()
            }
        }
        .build()
        return _starofdavid!!
    }

private var _starofdavid: ImageVector? = null
